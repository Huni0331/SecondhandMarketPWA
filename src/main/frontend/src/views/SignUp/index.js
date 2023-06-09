import React, {useState} from 'react'
import axios from "axios";

export default function SignUp() {

    const [requestResult, setRequestResult] = useState('');

    const signUpHandler = () => {
        const data = {
            "userEmail": "local123@gmail.com",
            "userPassword": "qwer1234!!",
            "userPasswordCheck": "qwer1234!!",
            "userNickname": "John doe",
            "userPhoneNumber": "010-1111-2222",
            "userAddress": "대한민국 서울시",
            "userAddressDetail": "1111"
        }
        axios.post("http://localhost:8080/api/auth/signUp", data)
            .then((response) => {setRequestResult('Success!!')})
            .catch((error) => {setRequestResult('Failed!!')})
    }

    return (
        <div>
            <h3>{requestResult}</h3>
            <button onClick={() => signUpHandler()}>회원가입</button>
        </div>
    )
}