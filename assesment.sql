CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT,
    marks DECIMAL(5,2)
);

-- Insert 3 sample students
INSERT INTO students (name, email, age, marks) VALUES
('Rahul', 'rahul@gmail.com', 22, 85.5),
('Priya', 'priya@gmail.com', 21, 91.0),
('Akash', 'akash@gmail.com', 23, 76.25);


SELECT * FROM students
WHERE age > 21;


UPDATE students
SET email = 'rahul@gmail.com'
WHERE id = 5;


DELETE FROM students
WHERE age < 18;


SELECT * FROM students
ORDER BY marks DESC
LIMIT 1 OFFSET 1;


CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    student_id INT,
    course_name VARCHAR(100),
    FOREIGN KEY (student_id) REFERENCES students(id)
);

-- Insert course data
INSERT INTO courses (course_id, student_id, course_name) VALUES
(101, 1, 'Java'),
(102, 2, 'Python'),
(103, 1, 'SQL');
