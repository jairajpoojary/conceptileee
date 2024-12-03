// DashboardController.java
@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/{userId}")
    public ResponseEntity<UserPerformance> getDashboard(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.getUserPerformance(userId));
    }
}