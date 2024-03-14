-- 코드를 입력하세요
select b.category, sum(bs.sales) as total_sales
from book b inner join book_sales bs
on b.book_id = bs.book_id
where to_char(sales_date, 'yyyy-mm') = '2022-01'
group by b.category
order by category;