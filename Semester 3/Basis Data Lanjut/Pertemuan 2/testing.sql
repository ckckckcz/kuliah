use [TSQL]
GO

SELECT 
    e.empid, 
    
    e.firstname, 
    e.lastname, 
    c.calendardate
FROM 
    HR.Employees e
CROSS JOIN 
    HR.Calendar c;
