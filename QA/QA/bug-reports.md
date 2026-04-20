# Bug Reports

---

## BUG-001: Login Button Not Responding

- Description: Login button does not respond after entering valid credentials
- Steps to Reproduce:
  1. Open login page
  2. Enter valid email and password
  3. Click "Login"
- Expected Result: User should be logged in and redirected to dashboard
- Actual Result: No response after clicking login button
- Severity: High
- Priority: High
- Status: Open

---

## BUG-002: Incorrect Error Message on Invalid Login

- Description: Wrong error message displayed when login fails
- Steps to Reproduce:
  1. Enter invalid email or password
  2. Click "Login"
- Expected Result: "Invalid credentials" message appears
- Actual Result: "Server error" message appears
- Severity: Medium
- Priority: Medium
- Status: Open

---

## BUG-003: Booking Allowed Without Login

- Description: System allows booking without user authentication
- Steps to Reproduce:
  1. Navigate to booking page without logging in
  2. Select a trip
  3. Click "Book"
- Expected Result: User should be redirected to login page
- Actual Result: Booking is completed without login
- Severity: High
- Priority: High
- Status: Open

---

## BUG-004: Slow Loading of Trips Page

- Description: Trips page takes too long to load
- Steps to Reproduce:
  1. Open trips page
- Expected Result: Page loads within 2 seconds
- Actual Result: Page loads in more than 5 seconds
- Severity: Low
- Priority: Low
- Status: Open