import React from 'react';
import Sidebar from '../components/Sidebar';
import { useState, useEffect } from 'react';
import * as ManagerService from '../../../services/api/ManagerService'

function PersonalInfor(props) {
    const [inforManager, setInforManager] = useState({})

    useEffect(() => {
        getManager()
        console.log(inforManager)
    }, []);
    
    const getManager = async () => {
        try {
            const data = await ManagerService.get(2)
            setInforManager(data)   
        } catch (error) {
            console.log(error)
        }
    }


    return (
        <div className='w-4/5 bg-orange-100 h-screen'>
            <h1>Trang thông tin quản lý</h1>
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
    );
}

export default PersonalInfor;