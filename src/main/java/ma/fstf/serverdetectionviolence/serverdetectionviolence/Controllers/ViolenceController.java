package ma.fstf.serverdetectionviolence.serverdetectionviolence.Controllers;


import lombok.AllArgsConstructor;

import ma.fstf.serverdetectionviolence.serverdetectionviolence.DTO.MessaageDTO;
import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.Message;
import ma.fstf.serverdetectionviolence.serverdetectionviolence.Services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Chat")
public class ViolenceController {
    @Autowired
    private MessageService MessageService;

    @PostMapping("/getMessages")
    public List<MessaageDTO> getMessages(@RequestBody MessaageDTO msg) throws Exception {

        return MessageService.getMessages(msg);
    }
    @GetMapping("/getMessages/{id}")
    public List<MessaageDTO> getMessages(@PathVariable Integer id) throws Exception {

        System.out.println("salamo");
        return MessageService.getMessages1(id);
    }

    @PostMapping ("/EnvoyerMessage")
    public void EnvoyerMessages(@RequestBody MessaageDTO msg) throws Exception {
        MessageService.envoyerMessage(msg);
    }


}
