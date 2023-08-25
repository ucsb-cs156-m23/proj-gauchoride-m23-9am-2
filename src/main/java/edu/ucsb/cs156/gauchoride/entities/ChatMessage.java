package edu.ucsb.cs156.gauchoride.entities;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonView;

import edu.ucsb.cs156.gauchoride.views.Views;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.GeneratedValue;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "chat_messages")
public class ChatMessage {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonView(Views.Public.class)
  private long id;

  // private long userId;

  @ManyToOne
  @JoinColumn(name = "user_id")
  @JsonView(Views.Public.class)
  private User user;
  
  @JsonView(Views.Public.class)
  private String payload;

  @CreationTimestamp
  @JsonView(Views.Public.class)
  private LocalDateTime timestamp;

    //UNUSED: TO IMPL LATER
  @JsonView(Views.Public.class)
  private boolean dm;

  @JsonView(Views.Public.class)
  private long toUserId;
}