import logo from './logo.svg';
import './App.css';
import {useEffect, useState} from "react";
import axios from "axios";
import * as string_decoder from "string_decoder";
import SignUp from "./views/SignUp";

function App() {

    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/>
            </header>
            <SignUp/>
        </div>
    );
}

export default App;
