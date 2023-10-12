package com.Kamesh.projects.PractisingJavaPrograms;

class Flower 
{
	 String whatsYourName(){
	     return  "I have many names and types.";   
	 }
}

class Jasmine extends Flower {
    
    @Override
    String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    
    @Override
    String whatsYourName(){
        return "Lily";
    }
}

class Region  {
    
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region {
    
    @Override
    Jasmine yourNationalFlower(){
        return new Jasmine();
        
    }
}

class AndhraPradesh extends Region{
    
     @Override
    Lily yourNationalFlower(){
        return new Lily();
    }
    
}
