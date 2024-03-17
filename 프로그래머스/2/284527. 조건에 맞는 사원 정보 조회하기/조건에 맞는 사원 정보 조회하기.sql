select a.score, a.emp_no, he.emp_name, he.position, he.email
from (
    select sum(score) as score, emp_no
    from hr_grade hg
    group by hg.emp_no
    order by score desc
    limit 1
) as a inner join hr_employees he
on a.emp_no = he.emp_no