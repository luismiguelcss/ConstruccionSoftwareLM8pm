# NexusMarket - Domain Value Objects

## 1. Purpose

This document describes the Value Objects currently implemented in NexusMarket.

The project uses a `DomainCatalog` base class for controlled domain concepts that share:

- `code`
- `name`
- `description`

The catalog-based Value Objects are immutable and expose predefined values instead of allowing arbitrary instances to be created throughout the application.

---

## 2. DomainCatalog

`DomainCatalog` is the abstract base class for the current catalog-style Value Objects.

```java
public abstract class DomainCatalog {

    private final String code;
    private final String name;
    private final String description;
}
```

It provides:

- `code`: stable identifier for the catalog value.
- `name`: human-readable name.
- `description`: explanation of the value.

The fields are `final`, so they cannot be changed after construction.

Equality is based explicitly on `code`.

---

## 3. SystemRole

Represents the type of system account or role associated with a `User`.

Current values:

| Code | Meaning |
|---|---|
| `BUYER` | Buyer account |
| `SELLER` | Seller account |
| `LOGISTICS_OPERATOR` | Performs logistics operations |
| `ADMINISTRATOR` | Performs administrative operations |
| `SUPERVISOR` | Performs supervisory and tracking operations |

Important: `SystemRole` classifies a system account. It does not create a `Buyer` or `Seller` domain object.

---

## 4. UserStatus

Represents the current status of a system account.

Current values:

- `ACTIVE`
- `INACTIVE`
- `BLOCKED`

It answers the system-level question:

> Can this User account operate in the system?

It is different from `ParticipantStatus`.

---

## 5. ParticipantStatus

Represents the commercial status of a `Participant`.

Current values:

- `ACTIVE`
- `SUSPENDED`

It answers the business-level question:

> Can this Buyer or Seller participate commercially?

Therefore:

```text
UserStatus
→ system account status

ParticipantStatus
→ commercial participation status
```

---

## 6. ProductType

Represents the type of product.

Current values:

- `PHYSICAL`
- `DIGITAL`

A physical product requires inventory and dispatch. A digital product can be delivered digitally after payment.

---

## 7. ProductStatus

Represents the lifecycle status of a product in the catalog.

Current values:

- `PUBLISHED`
- `SUSPENDED`
- `DISCONTINUED`

---

## 8. WarehouseOwnerType

Represents who owns a warehouse.

Current values:

- `MARKETPLACE`
- `SELLER`

This value is used by `Warehouse`.

---

## 9. InventoryMovementType

Classifies a concrete inventory movement.

Current values:

| Value | Meaning |
|---|---|
| `INBOUND` | Stock enters the warehouse |
| `RESERVATION` | Stock is reserved for an order |
| `SALE_OUTBOUND` | Stock leaves as the result of a sale |
| `ADJUSTMENT` | Stock is manually corrected |
| `RETURN` | Stock is reintroduced after a return |

The distinction between this Value Object and `InventoryMovement` is:

```text
InventoryMovementType
= what kind of movement?

InventoryMovement
= what movement actually happened?
```

---

## 10. OrderStatus

Represents the current lifecycle state of an Order.

Current values:

- `CART`
- `PENDING_PAYMENT`
- `PAID`
- `DISPATCHED`
- `DELIVERED`

Current conceptual flow:

```text
CART
  ↓
PENDING_PAYMENT
  ↓
PAID
  ↓
DISPATCHED
  ↓
DELIVERED
```

`CART` is currently represented as an Order status rather than as a separate `Cart` class.

---

## 11. InvoiceStatus

Represents the state of an Invoice.

Current values:

- `PENDING`
- `PAID`
- `VOIDED`

---

## 12. ShipmentStatus

Represents the state of a Shipment.

Current values:

- `IN_PREPARATION`
- `DISPATCHED`
- `IN_TRANSIT`
- `DELIVERED`

---

## 13. ReturnStatus

Represents the state of a return.

Current values:

- `REQUESTED`
- `APPROVED`
- `REJECTED`
- `REFUNDED`

---

## 14. OperationType

Represents the type of operational action recorded by the system.

Current values:

- `SELLER_REGISTRATION`
- `WAREHOUSE_REGISTRATION`
- `PRODUCT_REGISTRATION`
- `INVENTORY_MOVEMENT`
- `ORDER_CREATION`
- `ORDER_STATUS_CHANGE`
- `INVOICE_ISSUANCE`
- `SHIPMENT_DISPATCH`
- `RETURN_REQUEST`
- `REFUND_PROCESSED`

---

## 15. AuditSeverity

`AuditSeverity` is the only current simple Java enum in the domain.

Values:

```text
INFORMATION
WARNING
ERROR
CRITICAL
```

It classifies the severity of an audit event.

It does not itself register an event. `AuditLog` represents the audit record.

The current `AuditLog` class does not yet have a `severity` attribute, so `AuditSeverity` is currently defined but not directly referenced by `AuditLog`.

---

## 16. Why These Are Value Objects

The catalog classes are modeled as controlled, immutable values.

For example:

```java
OrderStatus.PAID
```

represents the predefined domain concept "Paid".

The application should use the predefined catalog values instead of allowing arbitrary status strings such as:

```text
"almost_paid"
"really_paid"
"finished_payment"
```

This keeps the domain vocabulary controlled and consistent.

The use of:

```java
public static final
```

means that the predefined values are available through the class and are not intended to be replaced.

The private constructors prevent arbitrary creation of new catalog values outside the class.

---

## 17. Summary Table

| Value Object | Purpose |
|---|---|
| `SystemRole` | System account role |
| `UserStatus` | System account status |
| `ParticipantStatus` | Commercial participation status |
| `ProductType` | Product category by delivery nature |
| `ProductStatus` | Product catalog lifecycle |
| `WarehouseOwnerType` | Warehouse ownership |
| `InventoryMovementType` | Inventory movement classification |
| `OrderStatus` | Order lifecycle |
| `InvoiceStatus` | Invoice lifecycle |
| `ShipmentStatus` | Shipment lifecycle |
| `ReturnStatus` | Return lifecycle |
| `OperationType` | Operational action classification |
| `AuditSeverity` | Audit event severity |
