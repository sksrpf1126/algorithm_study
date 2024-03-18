select fi.fish_count, fn.fish_name
from (
    select count(*) as fish_count, fish_type
    from fish_info
    group by fish_type
    ) as fi 
inner join fish_name_info fn
on fi.fish_type = fn.fish_type
order by fi.fish_count desc;