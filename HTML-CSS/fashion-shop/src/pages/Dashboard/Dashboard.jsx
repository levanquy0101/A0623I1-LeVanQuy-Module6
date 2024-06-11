import React from 'react';
import Sidebar from './components/Sidebar';

function Dashboard({children}) {
    
    return (
        <main className='w-full h-screen flex'>
            <Sidebar/>
            <div className='w-4/5 bg-orange-100 h-screen'>
                {children}
            </div>
        </main>
    );
}

export default Dashboard;