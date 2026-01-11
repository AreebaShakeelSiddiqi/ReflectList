
# 🌿 Reflect List

<p align="center">
  <b>A JavaFX-based To-Do & Mood Reflection Application</b><br>
  <i>Productivity with Spiritual Reflection</i>
</p>

---

## 📌 Project Description

**Reflect List** is a **JavaFX-based desktop application** designed to help users manage their daily tasks while also reflecting on their emotional well-being.

It integrates **motivational Ayat and Duas** based on the user's selected mood, providing **spiritual guidance alongside productivity features**.

### ✨ Users can:
- 🔐 Log in with a **username** (no password required)
- 📝 Track and manage tasks using a **To-Do List**
- 😊 Select their **current mood** and receive motivational content
- 🧭 Navigate easily between **Dashboard, Mood, and To-Do sections**

---

## 🚀 How to Run the Project

### ✅ Prerequisites
- **Java JDK 17 or above**
- **JavaFX SDK**
- **MySQL Server** (running locally)
- IDE such as **IntelliJ IDEA** or **Eclipse**

---

### 🗄️ Database Setup

```sql
-- Create database
CREATE DATABASE IF NOT EXISTS reflectlist;
USE reflectlist;

-- Create tasks table
CREATE TABLE IF NOT EXISTS tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    task_name VARCHAR(255) NOT NULL,
    is_done BOOLEAN DEFAULT FALSE
);

-- Insert built-in tasks
INSERT INTO tasks (task_name) VALUES
('Fajr'),
('Zuhar'),
('Asar'),
('Maghrib'),
('Isha'),
('Recitation of Holy Quran'),
('Recitation of Daily Adhkar');

SELECT * FROM tasks;
````

---

### ▶️ Steps to Run

1. Clone the repository:

   ```bash
   git clone <repository-url>
   ```
2. Import the project into your Java IDE
3. Add **JavaFX SDK** to the module path
4. Run `Main.java`

---

## 🧩 UML Diagram

Here’s the **class diagram** for the project:

![UML Diagram](https://github.com/AreebaShakeelSiddiqi/ReflectList/blob/main/UML%20Diagram.svg)

---

## 🖥️ Screenshots of Main GUI

<details>
<summary><b>🔐 Login Interface</b></summary>

![login](https://github.com/AreebaShakeelSiddiqi/ReflectList/blob/main/login.png)

</details>

<details>
<summary><b>📊 Dashboard</b></summary>

> ![dashboard](https://github.com/AreebaShakeelSiddiqi/ReflectList/blob/main/dashboard.png)

</details>

<details>
<summary><b>😊 Mood Selection</b></summary>

### 😄 Happy Mood

![happyMood](https://github.com/AreebaShakeelSiddiqi/ReflectList/blob/main/happyMood.png)

### 😄 Excited Mood
![excitedMood](https://github.com/AreebaShakeelSiddiqi/ReflectList/blob/main/ExcitedMood.png)

### 😢 Sad Mood

![sadMood](https://github.com/AreebaShakeelSiddiqi/ReflectList/blob/main/sadMood.png)

### 😔 Lonely Mood

![lonelyMood](https://github.com/AreebaShakeelSiddiqi/ReflectList/blob/main/lonelyMood.png)

### 😞 Depressed Mood

![depressedMood](https://github.com/AreebaShakeelSiddiqi/ReflectList/blob/main/DepressedMood.png)

</details>

<details>
<summary><b>📝 To-Do List</b></summary>

![todo_list](https://github.com/AreebaShakeelSiddiqi/ReflectList/blob/main/todo_list.png)
</details>

---
## ⭐ Features

* 👤 User session management with **username**
* 📖 Dynamic mood reflection with **random Ayat & Duas**
* ✅ Fully functional **To-Do List**
  * Add tasks
  * Delete tasks
  * Mark tasks as done
* 🧭 Smooth navigation between **Dashboard, Mood & To-Do**
* 🗄️ **MySQL database integration** for task persistence
---
## ⚠️ Limitations

* ❌ No authentication beyond username
* ❌ Supports only a **single local database**
* ❌ Static mood categories (no custom moods)
---
## 🔮 Future Improvements

* ⏰ Automatic daily task reset at midnight
* 🔁 Session management to keep users logged in until manual logout
* ☁️ Cloud database support
* ➕ Custom moods, Ayat, and Duas
* 📤 Export / Import tasks feature
* 🎨 Improved UI with animations and responsive layout

