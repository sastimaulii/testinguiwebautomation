Feature: Login Functionality

  Scenario: Login Berhasil
    Given saya berada di halaman login
    When saya memasukkan username "standard_user" dan password "secret_sauce"
    And saya klik tombol login
    Then saya harus dialihkan ke halaman inventory

  Scenario Outline: Login Gagal (Negatif & Batas)
    Given saya berada di halaman login
    When saya memasukkan username "<user>" dan password "<pass>"
    And saya klik tombol login
    Then muncul pesan error yang mengandung "<pesan>"

    Examples:
      | user          | pass         | pesan                               |
      | locked_out    | secret_sauce | Epic sadface: Username and password do not match any user in this service            |
      | user_salah    | pass_salah   | Username and password do not match  |
      |               |              | Username is required                |