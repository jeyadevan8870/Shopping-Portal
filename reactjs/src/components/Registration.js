import React from "react";

function Registration() {
  return (
    <div>
      <div className='col-d-12'>

        <div class="card card-container">


          <div class="form-group">
            <label className="label-reg" for="username">UserName </label>
            <input
              type="text"
              class="input--reg"

            />

            <div class="form-group">
              <label className="label-reg" for="Email">Email    </label>
              <input
                type="text"
                class="input--reg"

              />

            </div>
            <div class="form-group">
              <label className="label-reg">Password</label>
              <input
                type="password"
                class="input--reg"

              />

            </div>
            <div class="form-group">
              <button class="btn btn-primary btn-block">
                Login
              </button>
            </div>
          </div>
        </div>

      </div>
    </div>

  )

}
export default Registration