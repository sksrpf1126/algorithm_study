SELECT GOODSB.TITLE, GOODSB.BOARD_ID, GOODSR.REPLY_ID, GOODSR.WRITER_ID, GOODSR.CONTENTS,
DATE_FORMAT(GOODSR.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD GOODSB
INNER JOIN USED_GOODS_REPLY GOODSR
ON GOODSB.BOARD_ID = GOODSR.BOARD_ID
WHERE DATE_FORMAT(GOODSB.CREATED_DATE, '%Y-%m') = '2022-10'
ORDER BY GOODSR.CREATED_DATE, GOODSB.TITLE;