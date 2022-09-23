<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>

<h2>Product Discount Calculator</h2>
<form method="post" action="/calculator">

    <label>Mô tả sản phẩm: </label><br/>
    <input type="text" name="productDescription" placeholder="Description"><br/>
    <label>Giá niêm yết: </label><br/>
    <input type="number" name="productPrice" placeholder="Price"><br/>
    <label>Tỷ lệ phần trăm: </label><br/>
    <input type="number" name="discountPercent" placeholder="Percent"><br/>
    <input type="submit" id="submit" value="Discount Percent">

</form>

</body>
</html>