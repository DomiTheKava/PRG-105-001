import PlaygroundSupport
import SwiftUI
import UIKit

// psuedo code
//--- enums ---
//Enum model: LE $27,950, LE AWD $29,350, XLE $31,395, XLE AWD $29,350, Limited $34,965, Limited AWD $36,365
//Enum accessories: digital rear view mirror, fixed glass roof, Toyota multimedia touch screen, heated rear seats, Digital key capability, front and rear parking assist with automatic breaking.
//Enum Color: Cutting Edge, Guardian Grey, Midnight black metallic, supersonic red, win chill pearl, reservoir blue
//---
//--- class prius ---
//Class Prius:
//int year
//Bool Limited Premium Package  (Advanced Park, Panoramic View Monitor)
//Bool package Front and Rear Parking Assist with Automatic Braking
// 
//
//enum model
//enum packages
//enum accessories
//enum color
//function print info:
//print the info and stuff
//---

// Prius model option
enum Model {
    case LE
    case LE_AWD
    case XLE
    case XLE_AWD
    case Limited
    case Limited_AWD
}

// car accessories
enum Accessories {
    case digital_rear_view_mirror
    case fixed_glass_roof
    case touch_screen
    case heated_rear_seats
    case digital_key
    case park_assist
}

// color options
enum Color {
    case cutting_edge
    case guardian_grey
    case midnight_black
    case red
    case wind_chill_pearl
    case blue
}

// main class
class Toyota {
    
    var year: Int
    
    init(year: Int) {
        self.year = year
    }
    
}

// subclass of toyota, for Prius
class Prius : Toyota {
    
    var yearInput: Int
    
    var color: Color
    var accessories: [Accessories]
    var model: Model
    
    // initialize
    init(yearInput: Int, color: Color, accessories: [Accessories], model: Model) {
        self.yearInput = yearInput
        self.color = color
        self.accessories = accessories
        self.model = model
        
        super.init(year: yearInput)
    }
    
    func printData() {
        print("Year: \(year)")
        print("Model: \(model)")
        print("Color: \(color)")
        print("Accessories:")
        for i in accessories {
            print("\t", i)
        }
    }
}

// Customize Your Prius

var prius = Prius(yearInput: 2024,
                color: Color.blue,
                accessories: [Accessories.digital_key,
                              Accessories.heated_rear_seats,
                              Accessories.touch_screen],
                model: Model.Limited_AWD)



//

print("You chose:")
prius.printData()


//
