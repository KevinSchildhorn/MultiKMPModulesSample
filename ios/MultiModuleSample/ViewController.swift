//
//  ViewController.swift
//  MultiModuleSample
//
//  Created by Kevin Schildhorn on 7/29/20.
//  Copyright © 2020 Touchlab. All rights reserved.
//

import UIKit
import shared

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        PlatformKt.timesTwo(a: 2)
        PlatformiOSKt.currentTimeMillis()
        PlatformKt_.add(a: 2, b: 2)
        
        let customClass = CustomClass()
        PlatformKt.handleCustomClass(customClass: customClass)
    }
    
}

