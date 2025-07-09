# Spring Boot Observability with OpenTelemetry, Prometheus and Grafana

This project demonstrates how to monitor API latency and error rates in a Spring Boot application using OpenTelemetry, Prometheus, and Grafana — all with open source tools and no vendor lock-in.

## 📌 Features

* Trace + metrics collection with OpenTelemetry SDK
* OTLP gRPC export to OpenTelemetry Collector
* Distributed tracing with Jaeger
* Metrics scraping with Prometheus
* Real-time dashboards with Grafana
* Sample API (`/api/slow`, `/api/crash`) for testing latency and errors

## 📦 Tech Stack

| Layer         | Tool                                    |
| ------------- | --------------------------------------- |
| Application   | Spring Boot (3.2+)                      |
| Tracing       | OpenTelemetry SDK, Jaeger               |
| Metrics       | Micrometer → OpenTelemetry → Prometheus |
| Collector     | OpenTelemetry Collector (gRPC)          |
| Visualization | Grafana                                 |

## 🚀 Getting Started

```bash
# 1. Clone the repository
git clone https://github.com/devload/otel-spring-prometheus-grafana.git
cd otel-spring-prometheus-grafana

# 2. Launch observability stack
docker compose up -d

# 3. Run the Spring Boot application (in IDE or CLI)
./gradlew bootRun
```

## 📊 Dashboards

### Built-in JVM Dashboard (Grafana ID: `4701`)

Import directly from Grafana.com for JVM metrics.

### Custom API Metrics Dashboard

Use the provided dashboard JSON for:

* HTTP route breakdown
* 5xx error rate
* Average & P95 latency

📌 [Download spring-boot-dashboard.json](https://github.com/devload/otel-spring-prometheus-grafana/blob/main/spring-boot-dashboard.json)

## 🔍 Observability Flow

```text
Spring Boot → OpenTelemetry SDK
      ↓
OpenTelemetry Collector
   ↓            ↓
Prometheus     Jaeger
   ↓
Grafana
```

## 📂 Project Structure

```
.
├── docker-compose.yml
├── prometheus.yml
├── otel-collector-config.yml
├── spring-boot-dashboard.json
└── backend/
    └── spring-boot-app/
```

## 🧑‍💼 Author

**devload** – [@github](https://github.com/devload)
