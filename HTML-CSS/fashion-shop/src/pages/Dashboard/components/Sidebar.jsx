import React from 'react';
import { Link } from 'react-router-dom';

function Sidebar(props) {
    return (
        <aside className='w-1/5 h-full bg-slate-400 p-4'>
            <div>
                <div>
                    <h3>Nhân viên bán hàng</h3>
                    <ul className='px-4'>
                        <li>Thông tin nhân viên</li>
                        <li>Xem hàng hóa trong kho</li>
                        <li>Thanh toán</li>
                        <li>Thống kê</li>
                        <li>Thông báo</li>
                        <li>Hướng dẫn</li>
                    </ul>
                </div>
                <div>
                    <h3>Nhân viên kho hàng</h3>
                    <ul className='px-4'>
                        <li>Thông tin cá nhân</li>
                        <li>Hàng trong kho</li>
                        <li>Thống kê</li>
                        <li>Thông báo</li>
                        <li>Hướng dẫn</li>
                    </ul>
                </div>
                <div>
                    <h3>Quản lý bán hàng</h3>
                    <ul className='px-4'>
                        <li>
                            <Link to="/dashboard/infor">Thông tin cá nhân</Link>
                        </li>
                        <li>Đăng thông báo</li>
                        <li>Xem báo cáo</li>
                        <li>Hàng trong kho</li>
                        <li>Quản lý khách hàng</li>
                        <li>Quản lý nhân viên</li>
                    </ul>
                </div>
                <div>
                    <h3>Tin tức</h3>
                    <ul className='px-4'>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>
            </div>
        </aside>
    );
}

export default Sidebar;