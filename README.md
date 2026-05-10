# Task API (Spring Boot)

シンプルなタスク管理APIの雛形です。

## 技術スタック
- Java 11
- Spring Boot 2.7.x
- Spring Web
- Spring Data JPA
- H2 Database

## ディレクトリ構成

```
src/main/java/com/example/taskapi
├── TaskApiApplication.java
├── controller
│   └── TaskController.java
├── entity
│   ├── Task.java
│   └── TaskStatus.java
├── repository
│   └── TaskRepository.java
└── service
    ├── TaskService.java
    └── TaskServiceImpl.java
```

## 備考
- 現時点では「基本構成のみ」を作成しており、各CRUD処理の中身は未実装です。
