
SELECT tt2.* from (  
WITH RECURSIVE resources_itself_and_parent_tmp AS (
	SELECT * FROM table_01 r WHERE r.id='333'
	UNION ALL
	SELECT r.* FROM table_01 r,resources_itself_and_parent_tmp t WHERE t.parent_id= r.id
)select * from resources_itself_and_parent_tmp) tt2;

