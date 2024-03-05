select ao.animal_id, ao.name
from animal_outs as ao left outer join animal_ins as ai
on ao.animal_id = ai.animal_id
where intake_condition is null
order by animal_id;