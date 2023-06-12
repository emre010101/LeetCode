SELECT name AS Customers
FROM Customers
WHERE id not in(
  SELECT CustomerId
  FROM Orders
);