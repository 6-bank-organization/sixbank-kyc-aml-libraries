# sixbank-kyc-aml-libraries

> Shared domain and event library for the KYC/AML Microservice — part of the Six Bank Platform.

---

## 🧾 Overview

`sixbank-kyc-aml-libraries` is a foundational Maven library designed to provide a consistent and reusable set of DTOs, enums, utility classes, and event models for the **KYC/AML microservice** within the broader Six Bank ecosystem.

This library ensures schema consistency across services interacting with customer onboarding, document verification, liveness checks, and compliance rejection reasons. It is designed to support event-driven communication (e.g., Kafka) and promote reusability across the platform.

---

## 📦 Package Structure

```

com/sixbank/kyclibraries
├── dto         → Core data transfer objects used across KYC flows
├── enums       → Standardized enumerations (e.g., KycStatus, RejectionType)
├── events      → Event classes for Kafka/message-driven interactions
└── util        → Utility/helper classes supporting KYC logic

````

---

## 🔖 Maven Coordinates

You can import this library as a dependency in your microservices:

<details>
<summary>Gradle</summary>

```groovy
implementation 'com.sixbank:sixbank-kyc-aml-libraries:0.0.1-SNAPSHOT'
````
</details>


<details>
<summary>Maven</summary>

```xml
<dependency>
  <groupId>com.sixbank</groupId>
  <artifactId>sixbank-kyc-aml-libraries</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
````
</details>

---

## 🧩 Features

* ✅ Shared domain models for KYC/AML onboarding
* ✅ Event contracts for Kafka and message brokers
* ✅ JavaDoc support for all public classes
* ✅ Enum-based statuses and rejection reasons
* ✅ Reusable DTOs for service-to-service communication
* ✅ Utility classes for ID generation, validation, and mapping

---

## 📚 Documentation

To generate JavaDocs locally:

```bash
mvn javadoc:javadoc
```

Docs will be available in:

```
target/site/apidocs/index.html
```

---

## 🛠️ Building the Project

```bash
mvn clean install
```

To publish to your internal repository:

```bash
mvn clean deploy
```

Ensure proper credentials are configured in your `~/.m2/settings.xml`.

---

## 🧪 Testing

To run unit tests:

```bash
mvn test
```

Make sure event and DTO schemas are validated for serialization compatibility.

---

## 🚀 Example Usage

```java
import com.sixbank.kyclibraries.dto.KycApplicationDto;
import com.sixbank.kyclibraries.enums.KycStatus;
import com.sixbank.kyclibraries.events.DocumentFileUploadedEvent;

KycApplicationDto application = new KycApplicationDto();
application.setCustomerId(UUID.randomUUID());
application.setStatus(KycStatus.PENDING);

DocumentFileUploadedEvent event = new DocumentFileUploadedEvent(application.getId(), "passport.pdf");
// send to Kafka or handle internally
```

---

## 🏛️ Part of the Six Bank Platform

This library is a core component of the **Six Bank Platform**, powering digital onboarding and AML compliance workflows at scale.

---

## 📄 License

Proprietary & Confidential – © 2025 Six Bank. All rights reserved.

---

## 📫 Contact

For questions or integration support, reach out to the **Platform Engineering Team**.

