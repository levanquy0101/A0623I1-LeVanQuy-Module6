import React from 'react';
import { useForm } from 'react-hook-form';
import * as ManagerService from '../../../services/api/ManagerService'

function CreateEmployee() {

  const { register, handleSubmit, formState: { errors } } = useForm();

  const onSubmit = async (data) => {
    console.log(data); 
    if(data.doa == "salesman"){
        await ManagerService.save(data)
    }else{
        console.log("Không phải ")
    }
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
        <input type="text" {...register('doa',)} value={"salesman"} />
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
