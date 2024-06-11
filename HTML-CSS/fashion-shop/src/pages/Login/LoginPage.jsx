import React from 'react';
import { useForm } from 'react-hook-form';
import * as LoginService from '../../services/auth/LoginService'

function LoginPage(props) {
    const { register, handleSubmit, formState: { errors } } = useForm();

    const onSubmit = async(data) => {
        console.log(data);
        try{
            await LoginService.auth(data)
        }catch(e){
            alert(e.message)
        }
    };

    return (
        <div>
            <form onSubmit={handleSubmit(onSubmit)}>
                <h2>Trang đăng nhập</h2>
                <input type="text" {...register('username', { required: true })} placeholder="Username" />
                {errors.username && <span className="error">Username is required</span>}
                <input type="password" {...register('password', { required: true })} placeholder="********" />
                {errors.password && <span className="error">Password is required</span>}
                <input type="submit" value="Đăng nhập" />
            </form>
        </div>
    );
}

export default LoginPage;
