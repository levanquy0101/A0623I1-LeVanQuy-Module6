import React from 'react';
import Sidebar from './components/Sidebar';

function Dashboard() {
    return (
        <main className='w-full h-screen flex'>
            <Sidebar/>
            <div className='w-4/5 bg-orange-100 h-screen'>
                <h1>Trang Dashboard</h1>
            </div>
        </main>
    );
}

export default Dashboard;