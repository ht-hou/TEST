SELECT
  *
FROM
  Resource_coor
where
  RESOURCE_COOR.CT_ID = '3'
and x<=121.65279181340385
and y<=31.204808644878316
and x>=121.65020818659615
and y>=31.202591355121687
;
SELECT
  *
FROM
  Resource_coor
where
  RESOURCE_COOR.CT_ID = '1'
and ((x-(-1063.18796236057550))*(x-(-1063.18796236057550)))+((y-(-16181.877407861832))*(y-(-16181.877407861832)))<(100*100)





 and atan2(121.65279181340385, 31.2037) < atan2 (x, y)
  and atan2(121.65020818659615, 31.2037) > atan2 (x, y)
  and atan2(121.6515, 31.20480864487831) < atan2 (x, y)
  and atan2(121.6515, 31.20259135512168) > atan2 (x, y)
  
  
LIMIT
  0, 20;
-- 距离 -- 筛选距离小于463km的(可不写)，如果没查到数据就是没有小于463km的     -- 根据距离远近来排序 默认升序 （可不写）
HAVING
  distance < 463
ORDER BY
distance

,(
    (6378.1370 *1000 ) * acos (
      cos (radians(31.2037)) * cos(radians(y)) * cos(radians(x) - radians(121.6515)) + sin (radians(31.2037)) * sin(radians(y))
    )
  ) AS distance