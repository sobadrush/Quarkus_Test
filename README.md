# Quarkus Hello World 應用程式

這是一個使用 Quarkus 框架建立的簡單 Hello World Maven 應用程式。

## 需求

- Java 17 或更高版本
- Maven 3.8.1 或更高版本

## Maven 啟動指令

### 開發模式（熱重載）

```bash
mvn quarkus:dev
```

應用程式將在 `http://localhost:8080` 啟動，並支援熱重載功能。

### 編譯專案

```bash
mvn compile
```

### 執行測試

```bash
mvn test
```

### 清理並建置

```bash
mvn clean package
```

### 執行應用程式

```bash
mvn quarkus:dev
```

或使用已建置的 JAR 檔案：

```bash
java -jar target/quarkus-app/quarkus-run.jar
```

## 測試端點

- 訪問 `http://localhost:8080/hello` 應該會看到 "Hello World!" 訊息
- 訪問 `http://localhost:8080/hello/greeting` 應該會看到 "Greeting!" 訊息

## 建置應用程式

### 建置 JAR 檔案

```bash
mvn clean package
```

### 執行 JAR 檔案

```bash
java -jar target/quarkus-app/quarkus-run.jar
```

## 專案結構

```
.
├── pom.xml                          # Maven 配置檔案
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── HelloWorldResource.java  # REST 端點
│   │   └── resources/
│   │       └── application.yaml                  # 應用程式配置
│   └── test/
│       └── java/                                  # 測試程式碼
└── README.md
```

## 技術棧

- **Quarkus** 3.6.0 - 超音速、亞原子 Java 框架
- **RESTEasy Reactive** - JAX-RS 實作
- **Maven** - 專案管理工具

