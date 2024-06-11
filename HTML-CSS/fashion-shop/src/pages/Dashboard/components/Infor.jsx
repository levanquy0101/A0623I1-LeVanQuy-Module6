import React from 'react';
import Sidebar from '../components/Sidebar';
import { useState, useEffect } from 'react';
import * as ManagerService from '../../../services/api/ManagerService'
import { useForm } from 'react-hook-form';

function Infor(props) {
    const [inforManager, setInforManager] = useState({})
    const { register, handleSubmit, errors } = useForm();


    useEffect(() => {
        getManager()
        console.log(inforManager)
    }, []);

    const getManager = async () => {
        try {
            const data = await ManagerService.get("lvq")
            setInforManager(data)
        } catch (error) {
            console.log(error)
        }
    }

    const onSubmit = data => {
        console.log(data);
    };

    return (
        <div className='w-4/5 bg-orange-100 h-screen'>
            <div>
                <h1>Trang thông tin cá nhân quản lý</h1>
                {inforManager &&
                    (
                        <div>
                            <p>Mã User: {inforManager.code}</p>
                            <p>Tên: {inforManager.name}</p>
                            <p>Giới tính: {inforManager.gender}</p>
                            <p>Ngày sinh: {inforManager.date}</p>
                            <p>Username: {inforManager.username}</p>
                            <p>Địa chỉ email: {inforManager.email}</p>
                            <p>Số địa thoại: {inforManager.phone}</p>
                            <p>Địa chỉ: {inforManager.address}</p>
                        </div>
                    )
                }
            </div>
            <div>
                <form onSubmit={handleSubmit(onSubmit)}>
                    <input type="text" defaultValue={inforManager.username} {...register('username')} />
                    <input type="text" placeholder="Nhập mật khẩu cũ" {...register('oldPassword')} />
                    <input type="text" placeholder="Nhập mật khẩu mới" {...register('newPassword')} />
                    <button type="submit">Đổi mật khẩu</button>
                </form>
            </div>
        </div>
    );
}

export default Infor;