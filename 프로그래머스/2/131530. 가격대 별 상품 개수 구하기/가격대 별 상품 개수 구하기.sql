select (price DIV 10000) * 10000 as price_group, count(*) as products
from product
group by (price DIV 10000)
order by price_group;