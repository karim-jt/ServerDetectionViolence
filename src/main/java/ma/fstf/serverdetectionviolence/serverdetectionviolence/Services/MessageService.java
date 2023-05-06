package ma.fstf.serverdetectionviolence.serverdetectionviolence.Services;

import ma.fstf.serverdetectionviolence.serverdetectionviolence.DTO.MessaageDTO;
import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.Message;
import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.User;
import ma.fstf.serverdetectionviolence.serverdetectionviolence.Repository.MessageRepository;
import ma.fstf.serverdetectionviolence.serverdetectionviolence.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepo;
    @Autowired
    private UserRepository userRepo;

    public List<MessaageDTO> getMessages(MessaageDTO mes) {
        List<MessaageDTO> list1=new ArrayList<MessaageDTO>();

        User u=new User();
        u=userRepo.findUSERByIdIs(mes.getId_recep());
        User u1=new User();
        u1=userRepo.findUSERByIdIs(mes.getId_emmet());
        MessaageDTO m=new MessaageDTO();
        List<Message> list=messageRepo.findMessageByRecepEqualsAndEmmetEquals(u,u1);
        for(int i=0;i<list.size();i++){
            m.setImg(list.get(i).getImg());
            m.setTexte(list.get(i).getTexte());
            u1=list.get(i).getEmmet();
            m.setId_emmet(u1.getId());
            m.setEmetteur(u1.getUsername());

            u=list.get(i).getRecep();
            m.setId_recep(u.getId());
            m.setRecepteur(u.getUsername());
            m.setDate(list.get(i).getDate());
            list1.add(m);
        }

return list1;
    }
    public List<MessaageDTO> getMessages1(Integer id) {

        User u=new User();
        u=userRepo.findUSERByIdIs(id);
        User emeteur=new User();

List<MessaageDTO> list1=new ArrayList<>();System.out.println("la list est :");
        List<Message> list=messageRepo.findMessageByRecepEquals(id);

 for(int i=0;i<list.size();i++){
     MessaageDTO m= new MessaageDTO();
    m.setImg(list.get(i).getImg());
    m.setTexte(list.get(i).getTexte());
    emeteur=list.get(i).getEmmet();
    m.setId_emmet(emeteur.getId());
    m.setEmetteur(emeteur.getUsername());

    m.setRecepteur(u.getUsername());

   m.setDate(list.get(i).getDate());

    list1.add(m);
     System.out.println(list1+"l'iteration i"+i);
}

        return list1;
    }
    public void envoyerMessage(MessaageDTO mes) {
        LocalDate lt = LocalDate.now();

        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
        String text = lt.format(formatters);
        LocalDate parsedDate = LocalDate.parse(text, formatters);
        System.out.println("date "+lt);
    Message m=new Message();
        User emetteur=new User();
        User recepteur=new User();
    emetteur=userRepo.findUSERByIdIs(mes.getId_emmet());
    recepteur=userRepo.findUSERByIdIs(mes.getId_recep());
    m.setId(mes.getId());
    m.setImg(mes.getImg());
    System.out.println("id"+mes.getId());
        System.out.println("text"+mes.getTexte());
        System.out.println("Img"+mes.getImg());

        m.setTexte(mes.getTexte());
    m.setEmmet(emetteur);
    m.setRecep(recepteur);
    m.setDate(parsedDate);
    messageRepo.save(m);
    }

}


