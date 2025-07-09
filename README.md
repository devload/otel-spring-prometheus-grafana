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

## Posting
[OpenTelemetry와 Prometheus, Grafana로 Spring Boot API 응답시간과 에러율 모니터링하기](https://medium.com/@sunghyunroh/opentelemetry%EC%99%80-prometheus-grafana%EB%A1%9C-spring-boot-api-%EC%9D%91%EB%8B%B5%EC%8B%9C%EA%B0%84%EA%B3%BC-%EC%97%90%EB%9F%AC%EC%9C%A8-%EB%AA%A8%EB%8B%88%ED%84%B0%EB%A7%81%ED%95%98%EA%B8%B0-72f2ca381931?sk=a084d2d0c04a0e08c9483935be651e10)

## 🧑‍💼 Author

**devload** – [@github](https://github.com/devload)
