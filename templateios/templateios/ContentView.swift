//
//  ContentView.swift
//  templateios
//
//  Created by Adam McNeilly on 7/4/23.
//

import shared
import SwiftUI

struct ContentView: View {
    var body: some View {
        Text(Greeting().greet())
        .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
