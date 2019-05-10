package unal.poo.practica;

import becker.robots.*;

public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City parcela;
        public static Robot vaca1;
        //vaca2,vaca3,vaca4,vaca5,vaca6,vaca7,vaca8,vaca9,vaca10,vaca11,vaca12,vaca13,vaca14,vaca15;
        //public static Robot vaca16,vaca17,vaca18,vaca19,vaca20,vaca21,vaca22,vaca23,vaca24,vaca25,vaca26,vaca27,vaca28,vaca29,vaca30;

        
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            parcela = new City("Field.txt");
	    parcela.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            for(int i=1;i<=5;i++){
            vaca1 = new Robot(parcela,i, 1, Direction.EAST,0);
            vaca1 = new Robot(parcela,i, 5, Direction.EAST,0);
            vaca1 = new Robot(parcela,i, 9, Direction.EAST,0);

            vaca1 = new Robot(parcela,i, 3, Direction.WEST,0);
            vaca1 = new Robot(parcela,i, 7, Direction.WEST,0);
            vaca1 = new Robot(parcela,i, 11, Direction.WEST,0);
            
            
            }

	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            //vaca.move ();
            
            //Girar a la izquierda
           // vaca1.turnLeft();
            
            //Tomando decisiones, Si puedo tomar un Thing
           // boolean puedeTomar = vaca1.canPickThing();
            
            //Tomar un Thing
           // if(puedeTomar == true)
           //    vaca1.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
           // int numeroThings = vaca1.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
           // vaca1.putThing();
                       
            //Si el frente esta libre de Wall
           // vaca1.frontIsClear();
            
            //Invocando una funcion
           // creacionFuncion(4);
            
            //Toman un Thing
           // vaca1.pickThing();
            
            
	}
        
     //   public static void creacionFuncion(int parametroEntrada){
     //       for (int i = 0; i < parametroEntrada; i++) 
     //           vaca1.move();
     //   }
}

