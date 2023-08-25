package edu.ucsb.cs156.gauchoride.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.AccessLevel;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonView;

import edu.ucsb.cs156.gauchoride.views.Views;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
@JsonView(Views.Public.class)
  private long id;

@JsonView(Views.Public.class)
  private String email;

@JsonView(Views.Public.class)
  private String googleSub;

@JsonView(Views.Public.class)
  private String pictureUrl;

@JsonView(Views.Public.class)
  private String fullName;

@JsonView(Views.Public.class)
  private String givenName;
  
@JsonView(Views.Public.class)
  private String familyName;

@JsonView(Views.Public.class)
  private boolean emailVerified;

@JsonView(Views.Public.class)
  private String locale;

@JsonView(Views.Public.class)
  private String hostedDomain;

  @JsonView(Views.Internal.class)
  private String cellPhone;
  
  @Builder.Default
@JsonView(Views.Public.class)
  private boolean admin=false;

  @Builder.Default
@JsonView(Views.Public.class)
  private boolean driver=false;

  @Builder.Default
@JsonView(Views.Public.class)
  private boolean rider=false;
}
