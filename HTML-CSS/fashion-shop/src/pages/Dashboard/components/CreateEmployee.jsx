import React from 'react';
import { useForm } from 'react-hook-form';
import { useState,useEffect } from 'react';
import * as ManagerService from '../../../services/api/ManagerService'
import * as RolesService from '../../../services/api/RolesService'

function CreateEmployee() {
  const [roles, setRoles] = useState([]);
  const { register, handleSubmit, formState: { errors } } = useForm();

  useEffect(() => {
    getRoles()
  }, []);

  const getRoles = async () => {
    const res = await RolesService.getAll()
    setRoles(res)
  }
  const onSubmit = async (data) => {
    console.log(data); 
    data.role = JSON.parse(data.role)
    await ManagerService.save(data)
  };

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <div>
        <label>Mã nhân viên:</label>
        <input type="text" {...register('code',)} />
        {errors.code && <span>This field is required</span>}
      </div>
      <div>
        <label>Tên nhân viên:</label>
        <input type="text" {...register('name',)} />
        {errors.name && <span>This field is required</span>}
      </div>
      <div>
        <label>Giới tính:</label>
        <input type="text" {...register('gender',)} />
        {errors.gender && <span>This field is required</span>}
      </div>
      <div>
        <label>Ngày sinh:</label>
        <input type="text" {...register('date',)} />
        {errors.date && <span>This field is required</span>}
      </div>
      <div>
        <label>Địa chỉ:</label>
        <input type="text" {...register('address',)} />
        {errors.address && <span>This field is required</span>}
      </div>
      <div>
        <label>Phân quyền:</label>
        <select {...register('role',)}>
          <option value="">--- Phân quyền ---</option>
          {
            roles?.map(item => (
              <option key={item.id} value={JSON.stringify(item)}>{item.name}</option>
              )
            )
          }
        </select>
        {errors.name && <span>This field is required</span>}
      </div>
      <div>
        <label>Username:</label>
        <input type="text" {...register('username',)} />
        {errors.username && <span>This field is required</span>}
      </div>
      <div>
        <label>Password:</label>
        <input type="password" {...register('password',)} />
        {errors.password && <span>This field is required</span>}
      </div>
      <div>
        <label>Email:</label>
        <input type="email" {...register('email',)} />
        {errors.email && <span>This field is required</span>}
      </div>
      <div>
        <label>Phone:</label>
        <input type="tel" {...register('phone',)} />
        {errors.phone && <span>This field is required</span>}
      </div>
      <button type="submit">Submit</button>
    </form>
  );
}

export default CreateEmployee;
