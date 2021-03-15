 select * from  RESOURCE_DATA where RESOURCEID in (SELECT
    resourceid
    FROM
    Resource_coor
    where
    RESOURCE_COOR.CT_ID = '1'
    and ( ((x-(-1063.18796236057550))*(x-(-1063.18796236057550)))+((y-(-16181.877407861832))*(y-(-16181.877407861832)))<(100*100)
    ))
    
    ;
    
  select * from  RESOURCE_DATA where RESOURCEID in (  
    SELECT
   *
FROM
  Resource_coor
where
  RESOURCE_COOR.CT_ID = '3'

and (POWER((x-121.6515),2)/POWER(10.502537496227342,2)+POWER((y-31.2037),2)/POWER(9.0133639810541,2))<1

)resourceid
;

and x<=130.6648639810541
and y<=41.706237496227345
and x>=112.6381360189459
and y>=20.701162503772657