import React from 'react';

function Modal({ isOpen, onClose, children }) {
    if (!isOpen) return null;
    return (
        <div onClick={onClose}>
            <div onClick={e => e.stopPropagation()}>
                <button onClick={onClose}>X</button>
                {children}
            </div>
        </div>
    );
}

export default Modal;