import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mesaj")
public class Mesaj {
    private String mesaj = "Mesaj inițial";

    @GetMapping
    public String getMesaj() {
        return mesaj;
    }

    @PutMapping
    public void setMesaj(@RequestBody String noulMesaj) {
        mesaj = noulMesaj;
    }
}
