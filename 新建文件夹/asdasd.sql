CREATE OR REPLACE FUNCTION HTTP_REQUEST(
v_url  VARCHAR2,--請求地址
v_param  VARCHAR2,--POST請求參數-->>'muser=32323&&passwd=232323';GET拼接URL
v_type  varchar2--類型
)return varchar2 is
--GET--
 req UTL_HTTP.REQ;
 resp UTL_HTTP.RESP;
 v_line VARCHAR2 ( 4000 );
 v_text VARCHAR2 ( 4000 );
 v_param_length NUMBER ;
--post--
begin
    IF V_TYPE='GET' THEN
          v_text := '';
          req := UTL_HTTP.BEGIN_REQUEST ( url => v_url, method => 'GET' );
          UTL_HTTP.SET_BODY_CHARSET('UTF-8');
          UTL_HTTP.SET_HEADER(req, 'Content-Type', 'application/x-www-form-urlencoded');
          resp := UTL_HTTP.GET_RESPONSE ( req );
          UTL_HTTP.READ_LINE ( resp, v_line, TRUE );
          v_text := v_text || v_line;
          UTL_HTTP.END_RESPONSE( resp );

    ELSE
          v_param_length  := LENGTHB(v_param);
          req := UTL_HTTP.BEGIN_REQUEST (url=> v_url, method => 'POST');

          UTL_HTTP.SET_BODY_CHARSET('UTF-8');
          UTL_HTTP.SET_HEADER (r      =>  req,
                               name   =>  'Content-Type',
                               VALUE  =>  'application/x-www-form-urlencoded');
          UTL_HTTP.SET_HEADER (r      =>   req,
                               name   =>   'Content-Length',
                               VALUE  =>   v_param_length);
          UTL_HTTP.WRITE_RAW (r    => req,
                              data => UTL_RAW.CAST_TO_RAW(v_param));
                              resp := UTL_HTTP.GET_RESPONSE(req);
          UTL_HTTP.READ_LINE(resp, v_text, TRUE);
          UTL_HTTP.END_RESPONSE(resp);
    END IF;
    return v_text;
EXCEPTION
            WHEN UTL_HTTP.END_OF_BODY THEN
            UTL_HTTP.END_RESPONSE ( resp );
            WHEN OTHERS THEN
            UTL_HTTP.END_RESPONSE(resp);
            UTL_HTTP.END_REQUEST(req);
end;
select * from user_java_classes
