# NexusMarket - Software Architecture

## 1. Current Architecture

NexusMarket is being developed with Spring Boot and a domain-first approach inspired by Domain-Driven Design (DDD).

At the current stage, the implemented code is concentrated on the domain layer.

```text
application
├── NexusmarketApplication
└── domain
    ├── models
    ├── valueobjects
    └── enums
```

The current implementation should be considered the **domain foundation**, not the complete final application architecture.

---

## 2. Domain Layer

The domain layer contains the concepts that represent the business.

### Models

```text
application.domain.models
```

Contains:

- `Person`
- `Participant`
- `Buyer`
- `Seller`
- `User`
- `CommercialResource`
- `Product`
- `Warehouse`
- `Inventory`
- `InventoryMovement`
- `Order`
- `OrderItem`
- `Invoice`
- `Shipment`
- `Return`
- `Operation`
- `AuditLog`

These classes describe the objects and relationships currently identified in the NexusMarket domain.

### Value Objects

```text
application.domain.valueobjects
```

Contains the catalog-style domain values used by the models, including roles, statuses, product types, warehouse ownership and operation types.

### Enums

```text
application.domain.enums
```

Currently contains:

- `AuditSeverity`

---

## 3. Current Dependency Direction

The current implementation follows a simple dependency direction inside the domain:

```text
Models
  ↓
Value Objects
```

For example:

```text
Order
  └── OrderStatus

Product
  ├── ProductType
  └── ProductStatus

InventoryMovement
  └── InventoryMovementType

User
  ├── SystemRole
  └── UserStatus
```

The Value Objects do not depend on the models that use them.

---

## 4. Infrastructure Already Prepared

The Spring Boot project currently declares dependencies for:

- Spring Web MVC
- Spring Data JPA
- Spring Data MongoDB
- Spring Security
- MySQL Connector/J
- Lombok

These dependencies establish the technical foundation for later layers.

However, the current domain classes do not yet contain JPA or MongoDB mapping annotations. This keeps the current domain model separated from persistence concerns at this stage.

---

## 5. Planned Application Evolution

The current domain model is expected to become the center of a larger architecture.

A later version can evolve toward:

```text
Presentation / API
        ↓
Application / Use Cases
        ↓
Domain
        ↓
Ports
        ↓
Adapters / Infrastructure
        ↓
MySQL / MongoDB / External Services
```

The exact ports, services, repositories and adapters are not part of the current implementation and should be added only when their corresponding requirements are defined.

---

## 6. Persistence Strategy

The project is prepared for two persistence technologies:

### MySQL

Intended for structured transactional information such as:

- users and participants
- products
- warehouses
- inventory
- orders
- invoices
- shipments
- returns

### MongoDB

The current domain includes `AuditLog` with a flexible:

```java
Map<String, Object> details
```

This structure is compatible with the idea of storing flexible audit information in a document-oriented database.

The actual repositories and persistence mappings have not yet been implemented.

---

## 7. Security

Spring Security is already included as a project dependency.

At the current stage, `User`, `SystemRole`, and `UserStatus` describe the domain concepts needed for access control, but authentication and authorization behavior has not yet been implemented.

---

## 8. API and Testing

The final project is expected to expose application functionality through HTTP endpoints that can be tested with Postman.

At the current stage:

- controllers are not implemented;
- services/use cases are not implemented;
- REST endpoints are not implemented;
- Postman workflows are not implemented.

The domain model should therefore be completed and validated before these layers are developed.

---

## 9. Architectural Principles Applied So Far

### Separation of concerns

The current package structure separates:

```text
models
valueobjects
enums
```

instead of placing every domain concept in one package.

### Domain vocabulary

Business concepts are represented explicitly through classes such as:

- `Buyer`
- `Seller`
- `Product`
- `Warehouse`
- `Inventory`
- `Order`
- `Shipment`
- `Return`

### Controlled domain values

Statuses, roles and types are represented through dedicated Value Objects rather than unrestricted strings.

### Reuse through inheritance

Two important abstract bases reduce duplication:

```text
Person
└── Participant / User
```

and:

```text
CommercialResource
└── Product / Warehouse / Inventory / Order / Invoice / Shipment / Return
```

### Domain-first development

The current work focuses first on understanding and representing the business domain before implementing application services and infrastructure behavior.

---

## 10. Current Architecture Assessment

The current structure is coherent for the project's present stage.

The strongest parts are:

1. Clear separation between models and controlled domain values.
2. Reuse of common attributes through `Person`.
3. Reuse of the common commercial identifier through `CommercialResource`.
4. Separation between current inventory state and inventory movements.
5. Separation between a system account (`User`) and commercial participation (`Participant`).
6. Separation between domain concepts and persistence technology at this stage.

The following items remain design decisions for later iterations:

- whether payment requires its own domain model;
- whether refund requires its own domain model;
- whether the current `OrderStatus.CART` representation remains sufficient;
- whether `AuditSeverity` should be associated directly with `AuditLog`;
- which business rules should be enforced inside entities/value objects versus application/domain services;
- the exact ports and adapters required by the final use cases.

These should be resolved from requirements rather than added simply to increase the number of classes.

---

## 11. Conclusion

The current architecture establishes a domain foundation for NexusMarket.

The project currently prioritizes understanding and representing the business concepts before implementing the mechanisms that execute them.

The next architectural stage should introduce application behavior—use cases, services, ports and adapters—while preserving the domain concepts already established here.
