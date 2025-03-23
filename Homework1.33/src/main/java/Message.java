@RestController
@RequestMapping("/api")
class MessageController {
    private String message = "Salut! Acesta este mesajul inițial.";

    // Endpoint GET: http://localhost:8080/api/message
    @GetMapping("/message")
    public String getMessage() {
        return message;
    }

    // Endpoint PUT: http://localhost:8080/api/message
    @PutMapping("/message")
    public String updateMessage(@RequestBody String newMessage) {
        this.message = newMessage;
        return "Mesaj actualizat cu succes!";
    }
}
