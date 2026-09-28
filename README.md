# 💻 AssetTrack - Asset Management System

AssetTrack is a web-based Asset Management System developed using Java Spring Boot, MySQL, Thymeleaf, HTML, CSS, and JavaScript.

The system helps organizations manage company assets, employees, asset assignments, and returns through a centralized platform.

---

## 🚀 Features

### Admin Module
- Secure Admin Login
- Logout Functionality
- Session Management

### Asset Management
- Add Assets
- View Assets
- Delete Assets
- Asset Status Tracking
- Duplicate Asset Prevention

### Employee Management
- Add Employees
- View Employees
- Delete Employees
- Duplicate Employee Prevention

### Asset Assignment
- Assign Assets to Employees
- Prevent Multiple Assignment of Same Asset
- Asset Status Updates Automatically

### Asset Return
- Return Assigned Assets
- Return Date Tracking
- Asset Status Changes to AVAILABLE

### Dashboard
- Total Assets Count
- Total Employees Count
- Total Assignments Count
- System Overview

---

## 🛠 Technology Stack

### Frontend
- HTML
- CSS
- JavaScript
- Thymeleaf

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

### Database
- MySQL

### Build Tool
- Maven

### IDE
- IntelliJ IDEA

---

## 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.shubham.asset_management
│   │       ├── controller
│   │       ├── entity
│   │       ├── repository
│   │       ├── service
│   │       └── AssetManagementApplication
│   │
│   └── resources
│       ├── templates
│       ├── static
│       └── application.properties
```

---

## 🗄 Database Tables

### Admins

```sql
admins
```

### Assets

```sql
assets
```

### Employees

```sql
employees
```

### Asset Assignments

```sql
asset_assignments
```

---

## ⚙️ Functionalities

### Asset Status

```text
AVAILABLE
ASSIGNED
```

### Assignment Status

```text
ASSIGNED
RETURNED
```

---

## 📸 Screenshots

### Login Page
- Modern Admin Login Interface

### Dashboard
- Asset Statistics
- Employee Statistics
- Assignment Statistics

### Asset Management
- Asset Registration
- Asset Listing

### Employee Management
- Employee Registration
- Employee Listing

### Assignment Management
- Asset Assignment
- Asset Return

---

## 🔮 Future Enhancements

- Employee Login
- QR Code Tracking
- Barcode Integration
- Email Notifications
- PDF Reports
- Audit Logs
- Multi-Admin Support
- Cloud Deployment

---

## 🎯 Project Objectives

- Improve Asset Tracking
- Reduce Manual Work
- Prevent Duplicate Records
- Maintain Assignment History
- Centralize Asset Information

---

## 👨‍💻 Developer

**Shubham**

MCA Student  
Vishwakarma University

---

## 📄 License

This project is developed for academic and learning purposes.
