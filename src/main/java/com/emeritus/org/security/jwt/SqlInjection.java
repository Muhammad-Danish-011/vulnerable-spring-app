

// Using JdbcTemplate (Spring JDBC)
@Autowired
private Jdbc jdbc;

public void executeSafeQuery(String userInput) {
    String sql = "SELECT * FROM users WHERE username = ?";
    List<User> users = Jdbc.query(sql, new Object[]{userInput}, new BeanPropertyRowMapper<>(User.class));
    // Process the retrieved users
}
