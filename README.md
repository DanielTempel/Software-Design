# Strategy Pattern - Salary Calculation

This project demonstrates two implementations of salary calculation in an IT company.

## T1 - Basic Solution

The basic solution uses inheritance. Different employee types override
`calculateSalary()` with their own salary calculation algorithm.

Employee types:
- Developer
- DevOps Engineer
- Team Lead
- CEO

## T2 - Strategy Pattern Solution

The Strategy Pattern solution separates employee information from the salary
calculation algorithm.

`Employee` acts as the context and delegates salary calculation to
`SalaryStrategy`.

Strategies:
- FixedSalaryStrategy
- DevOpsSalaryStrategy
- TeamLeadSalaryStrategy
- CeoSalaryStrategy

Both implementations provide the same functionality but use different designs.

## UML

The UML diagrams for both implementations are located in the `docs` directory.