package edu.ucsb.cs156.gauchoride.models;

import edu.ucsb.cs156.gauchoride.entities.ChatMessage;
import lombok.Data;

@Data
public class ChatMessageDTO {
    private ChatMessage chatMessage;
    private String email;
    private String givenName;
    private String familyName;
    private String fullName;
}
