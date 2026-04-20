Test Cases #
## TC-001: User Login with Valid Credentials
- Description: Verify user can log in with correct email and password
- Preconditions: User has a valid registered account
- Steps:
  1. Open login page
  2. Enter valid email
  3. Enter correct password
  4. Click "Login"
- Expected Result: User is redirected to dashboard
- Actual Result: To be filled after execution
- Status: Pass/Fail

---

## TC-002: User Login with Invalid Credentials
- Description: Verify system shows error for invalid login
- Preconditions: User is on login page
- Steps:
  1. Enter invalid email or password
  2. Click "Login"
- Expected Result: Error message "Invalid credentials" is displayed
- Actual Result: To be filled
- Status: Pass/Fail

---

## TC-003: Booking a Trip
- Description: Verify user can successfully book a trip
- Preconditions: User is logged in
- Steps:
  1. Navigate to trips page
  2. Select a trip
  3. Click "Book"
- Expected Result: Booking is confirmed and saved in database
- Actual Result: To be filled
- Status: Pass/Fail

---

## TC-004: Booking Without Login
- Description: Verify system prevents booking without login
- Preconditions: User is not logged in
- Steps:
  1. Navigate to booking page
  2. Attempt to book a trip
- Expected Result: User is redirected to login page
- Actual Result: To be filled
- Status: Pass/Fail

---

## TC-005: Display Trips Data
- Description: Verify trips are loaded correctly from database
- Preconditions: Database contains trip data
- Steps:
  1. Open trips page
- Expected Result: All trips are displayed correctly
- Actual Result: To be filled
- Status: Pass/Fail