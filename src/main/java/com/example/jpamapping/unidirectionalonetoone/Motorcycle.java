package com.example.jpamapping.unidirectionalonetoone;
import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "MOTOR_CYCLE")
public class Motorcycle {
           
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int Id;
           
  @Column(name = "model_name")
  private String modelName = "";
           
  @Column(name = "manufacturer_name")
  private String manufacturerName = "";
           
  @Column(name = "gear_box")
  private String gearBox = "";
           
  @Column(name = "wheels")
  private String wheels = "";
           
  @Column(name = "length")
  private String length = "";
           
  @Column(name = "height")
  private String height = "";
           
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "engine_id")
  private Engine engine;
           
  public Motorcycle() {
  }

  public Motorcycle(String modelName, String manufacturerName, String gearBox, String wheels, 
                      String length, String height) {
    this.modelName = modelName;
    this.manufacturerName = manufacturerName;
    this.gearBox = gearBox;
    this.wheels = wheels;
    this.length = length;
    this.height = height;
  }
           
  public int getId() { return Id; }
  public void setId(int id) { Id = id; }
           
  public String getModelName() { return modelName; }       
  public void setModelName(String modelName) { this.modelName = modelName; }
           
  public String getManufacturerName() { return manufacturerName; }
  public void setManufacturerName(String manufacturerName) { this.manufacturerName = manufacturerName; }
           
  public String getGearBox() { return gearBox; }
  public void setGearBox(String gearBox) { this.gearBox = gearBox; }
           
  public String getWheels() { return wheels; }
  public void setWheels(String wheels) { this.wheels = wheels; }
           
  public String getLength() { return length; }
  public void setLength(String length) { this.length = length; }
           
  public String getHeight() { return height; }
  public void setHeight(String height) { this.height = height; }
           
  public Engine getEngine() { return engine; }
  public void setEngine(Engine engine) { this.engine = engine; }
           
  @Override
  public String toString() {
    return "Motorcycle{" +
      "Id=" + Id +
      ", modelName='" + modelName + '\'' +
      ", manufacturerName='" + manufacturerName + '\'' +
      ", gearBox='" + gearBox + '\'' +
      ", wheels='" + wheels + '\'' +
      ", length='" + length + '\'' +
      ", height='" + height + '\'' +
      ", engine=" + engine +
      '}';
  }
}
