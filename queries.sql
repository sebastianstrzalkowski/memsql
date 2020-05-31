select employee.name, employee.surname, departaments.name
from employee
         left join departaments on departaments.id = employee.departament_id
where departaments.id = 9;


select employee.name, employee.surname, departaments.name
from employee
         left join departaments on departaments.id = employee.departament_id
where departaments.name = 'departament1';

select name from employee where birthday < '1985-10-10';

select employee.id ,name, surname, salaries.salary from employee
left join salaries on salaries.employee_id = employee.id
group by employee.id;

select departaments.name, sum(salaries.salary)
from employee
         left join departaments on departaments.id = employee.departament_id
         left join salaries on salaries.employee_id = employee.id
where departaments.name = 'departament2'
group by departaments.name;

select departaments.name, avg(salaries.salary)
from employee
         left join departaments on departaments.id = employee.departament_id
         left join salaries on salaries.employee_id = employee.id
where departaments.name = 'departament2'
group by departaments.name;


